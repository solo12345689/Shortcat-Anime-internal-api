.class public Lm1/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field a:Lm1/f;

.field b:Lm1/f;

.field c:Lm1/f;

.field d:[Lm1/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lm1/g;

    .line 5
    .line 6
    const/16 v1, 0x100

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lm1/g;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lm1/c;->a:Lm1/f;

    .line 12
    .line 13
    new-instance v0, Lm1/g;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lm1/g;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lm1/c;->b:Lm1/f;

    .line 19
    .line 20
    new-instance v0, Lm1/g;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lm1/g;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lm1/c;->c:Lm1/f;

    .line 26
    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    new-array v0, v0, [Lm1/i;

    .line 30
    .line 31
    iput-object v0, p0, Lm1/c;->d:[Lm1/i;

    .line 32
    .line 33
    return-void
.end method
