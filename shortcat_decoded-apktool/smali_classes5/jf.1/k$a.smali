.class public final Ljf/k$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljf/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ljf/k$a;

.field private static final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljf/k$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljf/k$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljf/k$a;->a:Ljf/k$a;

    .line 7
    .line 8
    sget-object v0, Ljf/j;->a:Ljf/j;

    .line 9
    .line 10
    sput-object v0, Ljf/k$a;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
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

.method private static final a(LXe/f;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0
.end method

.method static synthetic b(LXe/f;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Ljf/k$a;->a(LXe/f;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, Ljf/k$a;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method
