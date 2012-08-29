git filter-branch -f --env-filter '
                GIT_COMMITTER_EMAIL="guillaume.masse@polymtl.ca";
                GIT_AUTHOR_EMAIL="guillaume.masse@polymtl.ca";
        ' HEAD
