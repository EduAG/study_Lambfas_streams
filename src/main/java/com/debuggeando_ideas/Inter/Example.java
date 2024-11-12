package com.debuggeando_ideas.Inter;

public class Example {
   /* public abstract class AbstractService <ExternalType, InternalType> implemets GenericService<ExternalType, InternalType> {

        public final Integer save(ExternalType object) {
            validate(object);
            InternalType domainObject = convert(object);
            return persist(domainObject);
        }

        protected abstract void validate(ExternalType object);
        protected abstract InternalType convert(ExternalType object);
        protected abstract Integer persist(InternalType object);
    }


    public class Service <ExternalType, InternalType> implemets GenericService<ExternalType, InternalType> {

        private final Validator validator;
        private final Converter converter;
        private final Dao dao;


    public Service(Validator validator, Converter converter, Dao dao) {
            this.validator = validator;
            this.converter = converter;
            this.dao = dao;
        }

        public Integer save(ExternalType input) {
            validator.validate(input);
            var internalType = converter.convert(input);
            return dao.persist(internalType);
        }
    }*/

    /*

strings.stream().filter(s -> s.length() > 5).sort().findFirst().orElse(someMethod());
strings.stream().filter(s -> s.length() > 5).sort().findFirst().orElseGet(() -> callSomeMethod());
    * */


    /*public abstract class AbstractService <ExternalType, InternalType> implemets GenericService<ExternalType, InternalType> {

  public final Integer save(ExternalType object) {
    validate(object);
    InternalType domainObject = convert(object);
    return persist(domainObject);
  }

  protected abstract void validate(ExternalType object);
  protected abstract InternalType convert(ExternalType object);
  protected abstract Integer persist(InternalType object);
}


public class Service <ExternalType, InternalType> implemets GenericService<ExternalType, InternalType> {

    private final Validator validator;
    private final Converter converter;
    private final Dao dao;


    public Service(Validator validator, Converter converter, Dao dao) {
       this.validator = validator;
       this.converter = converter;
       this.dao = dao;
    }

    public Integer save(ExternalType input) {
        validator.validate(input);
        var internalType = converter.convert(input);
        return dao.persist(internalType);
    }
}*/

    /*@Service
@AllArgsConstructor
public class MyService {
    private final Parser parser;
    public MyStructure parse(Sting input) {
        return parser.parse(input);
    }*/

    /*
    *
// GET
// 1 endpoint
// usr:/cities/1

{
   cities:[
       etc......
   }
}


// GET
// 1 endpoint
{
   addresses:[
       htttp: domain ; port/ adreess/1
       htttp: domain ; port/ adreess/2
   }
}
    * */
    /*
    *
// GET
// 1 endpoint
// usr:/cities/?num=x&name ?

{
   cities:[
       etc......
   }
}


// GET
// 1 endpoint
{
   addresses:[
       htttp: domain ; port/ adreess/1
       htttp: domain ; port/ adreess/2
   }
}
    *
    * */

    /*
    *
    *
// GET
// 1 endpoint
// usr:/products/1?num=x&name ?

{
   cities:[
       etc......
   }
}


// GET
// 1 endpoint
{
   addresses:[
       htttp: domain ; port/ adreess/1
       htttp: domain ; port/ adreess/2
   }
}
    * */

    /*
    * // GET
// 1 endpoint
// usr:/products/category

{
   cities:[
       etc......
   }
}


// GET
// 1 endpoint
{
   addresses:[
       htttp: domain ; port/ adreess/1
       htttp: domain ; port/ adreess/2
   }
}
    *
    * */

    /*
    *
    *
playback changes go back one revision go forward one revision
// GET
// 1 endpoint
// usr:/products/categories/{id}



{
   cities:[
       etc......
   }
}


// GET
// 1 endpoint
{
   addresses:[
       htttp: domain ; port/ adreess/1
       htttp: domain ; port/ adreess/2
   }
}
*
* /*

// GET
// 1 endpoint
// usr:/cars/1

{
    array of cars " as json"
}


// GET
// 1 endpoint
// usr:/cars?queryparameter

{
    array of cars " as json"
}




// GET
// 1 endpoint
// usr:/cars?brand=mazda

{
    array of cars " as json"
}


setSomething(returnSomething());
strings.stream().filter(s -> s.length() > 5).sort().findFirst().orElse(doSomething());

strings.stream().filter(s -> s.length() > 5).sort().findFirst().orElseGet(() -> doSomething());




setSomething(returnSometstrings.stream().filter(s -> s.length() > 5).sort().findFirst().orElse(doSomething());

strings.stream().filter(s -> s.length() > 5).sort().findFirst().orElseGet(() -> doSomething());



     */

}
