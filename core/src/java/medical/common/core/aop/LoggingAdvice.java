package medical.common.core.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class LoggingAdvice {
    @Pointcut(value = "execution(* liga.medical.common.service*.*(..))")
    private void generalPointCut(){}

    @Around(value = "generalPointCut()")
    public Object applicationLogger(ProceedingJoinPoint proceedingJoinPoint) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String className = proceedingJoinPoint.getTarget().getClass().toString();
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] array = proceedingJoinPoint.getArgs();
        log.info("Вызван метод : " + className + ":" + methodName + "с аргументами" + mapper.writeValueAsString(array));

        Object obj = null;
        try {
            obj = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        log.info(className + ":" + methodName + "() " + "Response: " + mapper.writeValueAsString(obj));
        return obj;
    }
}
