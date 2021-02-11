package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

// Methods to be used are inherited from CrudService
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
