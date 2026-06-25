.class public final LJf/E$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJf/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LJf/E$a;

.field private static final b:LJf/E;

.field private static final c:LJf/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJf/E$a;

    .line 2
    .line 3
    invoke-direct {v0}, LJf/E$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJf/E$a;->a:LJf/E$a;

    .line 7
    .line 8
    new-instance v0, LJf/F;

    .line 9
    .line 10
    invoke-direct {v0}, LJf/F;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LJf/E$a;->b:LJf/E;

    .line 14
    .line 15
    new-instance v0, LJf/G;

    .line 16
    .line 17
    invoke-direct {v0}, LJf/G;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, LJf/E$a;->c:LJf/E;

    .line 21
    .line 22
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(LJf/E$a;JJILjava/lang/Object;)LJf/E;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p5, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    const-wide p3, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, LJf/E$a;->a(JJ)LJf/E;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method


# virtual methods
.method public final a(JJ)LJf/E;
    .locals 1

    .line 1
    new-instance v0, LJf/H;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, LJf/H;-><init>(JJ)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c()LJf/E;
    .locals 1

    .line 1
    sget-object v0, LJf/E$a;->b:LJf/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LJf/E;
    .locals 1

    .line 1
    sget-object v0, LJf/E$a;->c:LJf/E;

    .line 2
    .line 3
    return-object v0
.end method
