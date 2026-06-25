.class public final Lk0/u;
.super Lk0/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:LY/D1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(LY/D1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk0/u;->b:LY/D1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(LY/b;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/u;->b:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/D1;->z()LY/E1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p1}, LY/E1;->d(LY/b;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, LY/D1;->D(I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public g(LY/b;)LY/h0;
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/u;->b:LY/D1;

    .line 2
    .line 3
    invoke-virtual {v0}, LY/D1;->z()LY/E1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lk0/u;->b:LY/D1;

    .line 8
    .line 9
    invoke-virtual {v1}, LY/D1;->z()LY/E1;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, LY/E1;->d(LY/b;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, p1}, LY/E1;->L(I)LY/h0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
