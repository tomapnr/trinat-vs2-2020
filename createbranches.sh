#
# create branches for all users


createbranch () {
  git checkout -b $1
  echo ''
  echo "## Branch of $1." >> README.md
  git commit -am "initial of branch"
  git push origin $1
  git checkout develop
}

createbranch bertrandnoemie
createbranch bollingerjerome
createbranch burtschyalexis
createbranch dittmannisabelle
createbranch engelsamuel
createbranch farnworthmorgan
createbranch gourdesmatis
createbranch jobenzo
createbranch kindtmichiel
createbranch kisslingmischa
createbranch lagellucas
createbranch legranddimitri
createbranch mehinovicharis
createbranch mohlertanja
createbranch portmanntheo
createbranch proebstingjonas
createbranch reytheo
createbranch roellingermaxime
createbranch schaetzelmichael
createbranch schmidtkarolina
createbranch wyserjennifer

# Collaborators
# legrandd
# LLagel
# enzojob
# Schmiche
# Haris-Mehinovic
# MatisGourdes
# KSchmidt888
# BollingerJerome
# tMohler57
# noemiebertrand
# isiid
# jonasprob
# Alexis68128
# Mitch0499
# reyTheo
# samegl
# srkdt


createdevelop () {
  # Create develop branch and push it to remote
  git checkout -b develop
  echo ''
  echo "## Branch of develop" >> README.md
  git commit -am "initial of branch"
  git push origin develop
}
