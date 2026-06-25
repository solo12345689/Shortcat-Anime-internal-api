.class Lmh/a;
.super Ljava/lang/Object;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:Lmh/b;

.field private final g:Lmh/h;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lmh/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmh/a;->f:Lmh/b;

    .line 5
    .line 6
    invoke-virtual {p1}, Lmh/b;->d()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lmh/a;->e:I

    .line 11
    .line 12
    invoke-virtual {p1}, Lmh/b;->e()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lmh/a;->d:I

    .line 17
    .line 18
    shl-int/lit8 v1, v0, 0x1

    .line 19
    .line 20
    iput v1, p0, Lmh/a;->a:I

    .line 21
    .line 22
    shr-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    iput v0, p0, Lmh/a;->b:I

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, Lmh/a;->c:I

    .line 31
    .line 32
    invoke-virtual {p1}, Lmh/b;->g()Lmh/h;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lmh/a;->g:Lmh/h;

    .line 37
    .line 38
    return-void
.end method
