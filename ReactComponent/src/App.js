import logo from './logo.svg';
import './App.css';
import FunctionalComponentTest from './functionalComponent';
import FunctionalComponentTest2 from './functionalComponent2';
import FunctionalComponentTest3 from './funtionalComponent3';
import React from 'react';

import ClassComponent from './classComponent.js';
function App() {
  return (
    <div className="App">
      <FunctionalComponentTest/>
      <FunctionalComponentTest2/>
      <FunctionalComponentTest3/>
      <ClassComponent />
    </div>
  );
}

export default App;
