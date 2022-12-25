package io.vaibhav.bean.scope.beans.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * New Bean when every time requested
 */
@Component
@Scope(value = "prototype")
public class SpringBean2 {
}
