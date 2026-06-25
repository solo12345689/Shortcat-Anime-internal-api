.class public final Ll1/s$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field static final synthetic a:Ll1/s$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll1/s$b;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/s$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll1/s$b;->a:Ll1/s$b;

    .line 7
    .line 8
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


# virtual methods
.method public final a()Ll1/s$a;
    .locals 2

    .line 1
    new-instance v0, Ll1/t;

    .line 2
    .line 3
    const-string v1, "spread"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll1/t;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final b()Ll1/s$a;
    .locals 2

    .line 1
    new-instance v0, Ll1/t;

    .line 2
    .line 3
    const-string v1, "preferWrap"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll1/t;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final c()Ll1/s;
    .locals 2

    .line 1
    new-instance v0, Ll1/t;

    .line 2
    .line 3
    const-string v1, "wrap"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ll1/t;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final d(F)Ll1/s;
    .locals 2

    .line 1
    new-instance v0, Ll1/t;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ll1/t;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
