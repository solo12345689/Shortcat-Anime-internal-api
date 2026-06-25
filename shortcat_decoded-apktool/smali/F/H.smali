.class public final LF/H;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/foundation/lazy/layout/c;


# instance fields
.field private final b:Lt/T;

.field private final c:[Ljava/lang/Object;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Loe/f;LF/m;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LF/m;->g()LF/d;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p1}, Loe/d;->f()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ltz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Loe/d;->i()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-interface {p2}, LF/d;->getSize()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ge p1, v0, :cond_0

    .line 29
    .line 30
    invoke-static {}, Lt/U;->a()Lt/T;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, LF/H;->b:Lt/T;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    new-array p2, p1, [Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p2, p0, LF/H;->c:[Ljava/lang/Object;

    .line 40
    .line 41
    iput p1, p0, LF/H;->d:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    sub-int v1, p1, v0

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    new-array v2, v1, [Ljava/lang/Object;

    .line 49
    .line 50
    iput-object v2, p0, LF/H;->c:[Ljava/lang/Object;

    .line 51
    .line 52
    iput v0, p0, LF/H;->d:I

    .line 53
    .line 54
    new-instance v2, Lt/K;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Lt/K;-><init>(I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, LF/H$a;

    .line 60
    .line 61
    invoke-direct {v1, v0, p1, v2, p0}, LF/H$a;-><init>(IILt/K;LF/H;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p2, v0, p1, v1}, LF/d;->a(IILkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, LF/H;->b:Lt/T;

    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "negative nearestRange.first"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public static final synthetic a(LF/H;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LF/H;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LF/H;)I
    .locals 0

    .line 1
    iget p0, p0, LF/H;->d:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public c(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, LF/H;->b:Lt/T;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt/T;->b(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lt/T;->c:[I

    .line 10
    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    return p1
.end method

.method public d(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LF/H;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, LF/H;->d:I

    .line 4
    .line 5
    sub-int/2addr p1, v1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, LUd/n;->f0([Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-gt p1, v1, :cond_0

    .line 13
    .line 14
    aget-object p1, v0, p1

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method
