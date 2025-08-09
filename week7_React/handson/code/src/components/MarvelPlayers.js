import React from 'react';

const marvelHeroes = ['Iron Man', 'Spider-Man', 'Thor', 'Hulk', 'Black Panther'];
const dcHeroes = ['Batman', 'Superman', 'Flash', 'Wonder Woman'];

const mergedHeroes = [...marvelHeroes, ...dcHeroes];

const MarvelPlayers = () => {
  const oddHeroes = mergedHeroes.filter((_, index) => index % 2 !== 0);
  const evenHeroes = mergedHeroes.filter((_, index) => index % 2 === 0);

  return (
    <div>
      <h2>Odd Index Heroes</h2>
      <ul>
        {oddHeroes.map((hero, index) => (
          <li key={index}>{hero}</li>
        ))}
      </ul>

      <h2>Even Index Heroes</h2>
      <ul>
        {evenHeroes.map((hero, index) => (
          <li key={index}>{hero}</li>
        ))}
      </ul>

      <h2>All Heroes Merged</h2>
      <ul>
        {mergedHeroes.map((hero, index) => (
          <li key={index}>🦸 {hero}</li>
        ))}
      </ul>
    </div>
  );
};

export default MarvelPlayers;
