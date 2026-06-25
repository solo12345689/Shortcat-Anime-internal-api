.class abstract synthetic LJf/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lkotlin/jvm/functions/Function1;

.field private static final b:Lkotlin/jvm/functions/Function2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJf/l;

    .line 2
    .line 3
    invoke-direct {v0}, LJf/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJf/n;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance v0, LJf/m;

    .line 9
    .line 10
    invoke-direct {v0}, LJf/m;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LJf/n;->b:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, LJf/n;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, LJf/n;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static final e(LJf/e;)LJf/e;
    .locals 2

    .line 1
    instance-of v0, p0, LJf/I;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    sget-object v0, LJf/n;->a:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    sget-object v1, LJf/n;->b:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, LJf/n;->f(LJf/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)LJf/e;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static final f(LJf/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)LJf/e;
    .locals 2

    .line 1
    instance-of v0, p0, LJf/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LJf/d;

    .line 7
    .line 8
    iget-object v1, v0, LJf/d;->b:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    if-ne v1, p1, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, LJf/d;->c:Lkotlin/jvm/functions/Function2;

    .line 13
    .line 14
    if-ne v0, p2, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, LJf/d;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, p2}, LJf/d;-><init>(LJf/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
