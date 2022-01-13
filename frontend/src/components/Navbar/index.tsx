import {ReactComponent as GithubIcon} from 'assets/img/Github.svg';
import './style.css'
function Navbar(){

    return(
        <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a href="https://github.com/FernandoRodrigues123">
              <div className="dsmovie-nav-content-icon">
                <GithubIcon />
                <p className="dsmovie-contatic-link">/Devsuperior</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
  
    );
}
export default Navbar;