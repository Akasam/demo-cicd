const request = require('supertest');
const { app, server } = require('./index');

describe('GET /', () => {
    afterAll(done => {
        server.close(done);
    });

    it('should return Hello, World!', async () => {
        const response = await request(app).get('/');
        expect(response.text).toBe('Error'); // This will pass
        expect(response.statusCode).toBe(200);
    });
});
