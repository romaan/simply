module.exports = {
    entry: "./src/index.js",
    output: {
        path: __dirname,
        filename: "dist/bundle.js"
    },
    module: {
        loaders: [
            { test: /\.css$/, loader: "style!css" },
            {
              test: /\.js$/,
              exclude: /node_modules/,
              loader: "babel",
              include: __dirname,
              query: {
                presets: [ 'es2015', 'react', , 'react-hmre'  ]
              }
            }
        ]
    }
};
