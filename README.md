# Proj4j for jeo

This repository is a fork of http://svn.osgeo.org/metacrs/proj4j/trunk. It contains patches not yet accepted 
upstream. It is not the intention of this fork to diverge, only to allow the jeo project to move forward 
while waiting for patches to applied upstream.

This repository contains the following branches.

* jeo - The integration branch, containing all relevant patches
* master - Direct mirror of upstream svn repository
* numbered branches for each pending patch

# Linking to Subversion

When cloning this repository some additional work must be done to link the local clone back the original 
svn repository.

    % git svn init http://svn.osgeo.org/metacrs/proj4j/trunk
    % git svn fetch -r 1687:HEAD
    
