.class public final LA2/P;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA2/P$b;
    }
.end annotation


# static fields
.field public static final i:LA2/P;


# instance fields
.field public final a:LP9/w;

.field public final b:Ljava/lang/Double;

.field public final c:Ljava/lang/Double;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LA2/P$b;

    .line 2
    .line 3
    invoke-direct {v0}, LA2/P$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LA2/P$b;->h()LA2/P;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LA2/P;->i:LA2/P;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(LA2/P$b;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, LA2/P$b;->a(LA2/P$b;)LP9/w;

    move-result-object v0

    iput-object v0, p0, LA2/P;->a:LP9/w;

    .line 4
    invoke-static {p1}, LA2/P$b;->b(LA2/P$b;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, LA2/P;->b:Ljava/lang/Double;

    .line 5
    invoke-static {p1}, LA2/P$b;->c(LA2/P$b;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, LA2/P;->c:Ljava/lang/Double;

    .line 6
    invoke-static {p1}, LA2/P$b;->d(LA2/P$b;)Z

    move-result v0

    iput-boolean v0, p0, LA2/P;->d:Z

    .line 7
    invoke-static {p1}, LA2/P$b;->e(LA2/P$b;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, LA2/P;->e:Z

    .line 8
    invoke-static {p1}, LA2/P$b;->e(LA2/P$b;)Z

    move-result v0

    iput-boolean v0, p0, LA2/P;->f:Z

    .line 9
    invoke-static {p1}, LA2/P$b;->f(LA2/P$b;)Z

    move-result v0

    iput-boolean v0, p0, LA2/P;->g:Z

    .line 10
    invoke-static {p1}, LA2/P$b;->g(LA2/P$b;)Z

    move-result p1

    iput-boolean p1, p0, LA2/P;->h:Z

    return-void
.end method

.method synthetic constructor <init>(LA2/P$b;LA2/P$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LA2/P;-><init>(LA2/P$b;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, LA2/P;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, LA2/P;

    .line 8
    .line 9
    iget-object v0, p0, LA2/P;->a:LP9/w;

    .line 10
    .line 11
    iget-object v2, p1, LA2/P;->a:LP9/w;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, LP9/w;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-boolean v0, p0, LA2/P;->f:Z

    .line 20
    .line 21
    iget-boolean v2, p1, LA2/P;->f:Z

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, LA2/P;->b:Ljava/lang/Double;

    .line 26
    .line 27
    iget-object v2, p1, LA2/P;->b:Ljava/lang/Double;

    .line 28
    .line 29
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, LA2/P;->c:Ljava/lang/Double;

    .line 36
    .line 37
    iget-object v2, p1, LA2/P;->c:Ljava/lang/Double;

    .line 38
    .line 39
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-boolean v0, p0, LA2/P;->d:Z

    .line 46
    .line 47
    iget-boolean v2, p1, LA2/P;->d:Z

    .line 48
    .line 49
    if-ne v0, v2, :cond_1

    .line 50
    .line 51
    iget-boolean v0, p0, LA2/P;->g:Z

    .line 52
    .line 53
    iget-boolean v2, p1, LA2/P;->g:Z

    .line 54
    .line 55
    if-ne v0, v2, :cond_1

    .line 56
    .line 57
    iget-boolean v0, p0, LA2/P;->h:Z

    .line 58
    .line 59
    iget-boolean p1, p1, LA2/P;->h:Z

    .line 60
    .line 61
    if-ne v0, p1, :cond_1

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    return p1

    .line 65
    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, LA2/P;->a:LP9/w;

    .line 2
    .line 3
    iget-object v1, p0, LA2/P;->b:Ljava/lang/Double;

    .line 4
    .line 5
    iget-object v2, p0, LA2/P;->c:Ljava/lang/Double;

    .line 6
    .line 7
    iget-boolean v3, p0, LA2/P;->d:Z

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-boolean v4, p0, LA2/P;->f:Z

    .line 14
    .line 15
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    iget-boolean v5, p0, LA2/P;->g:Z

    .line 20
    .line 21
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-boolean v6, p0, LA2/P;->h:Z

    .line 26
    .line 27
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    return v0
.end method
