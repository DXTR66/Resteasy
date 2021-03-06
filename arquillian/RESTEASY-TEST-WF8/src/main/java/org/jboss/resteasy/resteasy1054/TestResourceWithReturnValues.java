package org.jboss.resteasy.resteasy1054;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * 
 * @author <a href="ron.sigal@jboss.com">Ron Sigal</a>
 * @version $Revision: 1.1 $
 *
 * Copyright May 18, 2013
 */
@Path("/return")
public class TestResourceWithReturnValues
{
   @POST
   @Path("/native")
   @Valid
   public Foo postNative(Foo foo)
   {
      return foo;
   }

   @POST
   @Path("/imposed")
   @FooConstraint(min=3,max=5)
   public Foo postImposed(Foo foo)
   {
      return foo;
   }

   @POST
   @Path("nativeAndImposed")
   @Valid
   @FooConstraint(min=3,max=5)
   public Foo postNativeAndImposed(Foo foo)
   {
      return foo;
   }
}
