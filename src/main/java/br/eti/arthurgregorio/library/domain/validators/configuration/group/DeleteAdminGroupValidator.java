package br.eti.arthurgregorio.library.domain.validators.configuration.group;

import br.eti.arthurgregorio.library.domain.model.entities.configuration.Group;
import br.eti.arthurgregorio.library.domain.model.exception.BusinessLogicException;
import br.eti.arthurgregorio.library.domain.validators.BusinessLogic;

import javax.enterprise.context.Dependent;

/**
 * {@link BusinessLogic} to run if you are deleting the admin group
 *
 * @author Arthur Gregorio
 *
 * @version 1.0.0
 * @since 1.3.1, 09/08/2018
 */
@Dependent
public class DeleteAdminGroupValidator implements GroupDeletingLogic {

    /**
     * {@inheritDoc }
     *
     * @param value
     */
    @Override
    public void run(Group value) {
        if (value.isAdministrator()) {
            throw new BusinessLogicException("error.group.delete-administrator");
        }        
    }
}
