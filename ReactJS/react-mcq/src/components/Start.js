import React from "react";

const Start = ({onQuizStart}) => {
    return(
        <div className="card">
            <div className="card-content">
                <div className="content">
                    <h1>Start MCQ</h1>
                    <button className="button is-info is-medium" onClick={onQuizStart}>Start</button>

                </div>
            </div>
        </div>
    );
}

export default Start;