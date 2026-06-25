.class public final Lq6/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/e$a;
    }
.end annotation


# static fields
.field public static final e:Lq6/e$a;

.field private static final f:Lkotlin/Lazy;


# instance fields
.field private a:I

.field private b:Ljava/util/List;

.field private final c:Lq6/a;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq6/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lq6/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq6/e;->e:Lq6/e$a;

    .line 8
    .line 9
    sget-object v0, LTd/q;->a:LTd/q;

    .line 10
    .line 11
    new-instance v1, Lq6/d;

    .line 12
    .line 13
    invoke-direct {v1}, Lq6/d;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, LTd/n;->a(LTd/q;Lie/a;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lq6/e;->f:Lkotlin/Lazy;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lq6/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lq6/a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lq6/e;->c:Lq6/a;

    .line 10
    .line 11
    invoke-direct {p0}, Lq6/e;->h()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a()Lq6/e;
    .locals 1

    .line 1
    invoke-static {}, Lq6/e;->f()Lq6/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic b()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, Lq6/e;->f:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(Ljava/io/InputStream;)Lq6/c;
    .locals 1

    .line 1
    sget-object v0, Lq6/e;->e:Lq6/e$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lq6/e$a;->c(Ljava/io/InputStream;)Lq6/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final e()Lq6/e;
    .locals 1

    .line 1
    sget-object v0, Lq6/e;->e:Lq6/e$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq6/e$a;->d()Lq6/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final f()Lq6/e;
    .locals 1

    .line 1
    new-instance v0, Lq6/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lq6/e;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq6/e;->c:Lq6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq6/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lq6/e;->a:I

    .line 8
    .line 9
    iget-object v0, p0, Lq6/e;->b:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lq6/c$b;

    .line 31
    .line 32
    iget v2, p0, Lq6/e;->a:I

    .line 33
    .line 34
    invoke-interface {v1}, Lq6/c$b;->b()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Lq6/e;->a:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Ljava/io/InputStream;)Lq6/c;
    .locals 4

    .line 1
    const-string v0, "is"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lq6/e;->a:I

    .line 7
    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    sget-object v2, Lq6/e;->e:Lq6/e$a;

    .line 11
    .line 12
    invoke-static {v2, v0, p1, v1}, Lq6/e$a;->a(Lq6/e$a;ILjava/io/InputStream;[B)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object v0, p0, Lq6/e;->c:Lq6/a;

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Lq6/a;->a([BI)Lq6/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Lq6/b;->n:Lq6/c;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-boolean v2, p0, Lq6/e;->d:Z

    .line 31
    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    sget-object v0, Lq6/c;->d:Lq6/c;

    .line 35
    .line 36
    :cond_0
    sget-object v2, Lq6/c;->d:Lq6/c;

    .line 37
    .line 38
    if-eq v0, v2, :cond_1

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    iget-object v0, p0, Lq6/e;->b:Ljava/util/List;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lq6/c$b;

    .line 60
    .line 61
    invoke-interface {v2, v1, p1}, Lq6/c$b;->a([BI)Lq6/c;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Lq6/c;->d:Lq6/c;

    .line 66
    .line 67
    if-eq v2, v3, :cond_2

    .line 68
    .line 69
    return-object v2

    .line 70
    :cond_3
    sget-object p1, Lq6/c;->d:Lq6/c;

    .line 71
    .line 72
    return-object p1
.end method

.method public final g(Z)Lq6/e;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lq6/e;->d:Z

    .line 2
    .line 3
    return-object p0
.end method
