package org.vimal.security.v3.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class ValidateInputsForUsersUpdationResultDto extends ValidateInputsForUsersCreationResultDto {
    private Set<String> oldUsernames;
    private Set<String> duplicateOldUsernames;
    private Set<String> invalidOldUsernames;
    private Map<String, String> usernameToOldUsernameMap;
    private Map<String, String> emailToOldUsernameMap;

    public ValidateInputsForUsersUpdationResultDto(Set<String> invalidInputs,
                                                   Set<String> usernames,
                                                   Set<String> emails,
                                                   Set<String> duplicateUsernamesInDtos,
                                                   Set<String> duplicateEmailsInDtos,
                                                   Set<String> roles,
                                                   Set<String> restrictedRoles,
                                                   Set<String> oldUsernames,
                                                   Set<String> duplicateOldUsernames,
                                                   Set<String> invalidOldUsernames,
                                                   Map<String, String> usernameToOldUsernameMap,
                                                   Map<String, String> emailToOldUsernameMap) {
        super(
                invalidInputs,
                usernames,
                emails,
                duplicateUsernamesInDtos,
                duplicateEmailsInDtos,
                roles,
                restrictedRoles
        );
        this.oldUsernames = oldUsernames;
        this.duplicateOldUsernames = duplicateOldUsernames;
        this.invalidOldUsernames = invalidOldUsernames;
        this.usernameToOldUsernameMap = usernameToOldUsernameMap;
        this.emailToOldUsernameMap = emailToOldUsernameMap;
    }
}
