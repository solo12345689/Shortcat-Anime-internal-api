.class public final Lcom/facebook/react/modules/network/NetworkingModule$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/network/NetworkingModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/network/NetworkingModule$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/react/modules/network/NetworkingModule$a;Ldg/A$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule$a;->c(Ldg/A$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic b(Lcom/facebook/react/modules/network/NetworkingModule$a;JJ)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/modules/network/NetworkingModule$a;->e(JJ)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final c(Ldg/A$a;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/modules/network/NetworkingModule;->access$getCustomClientBuilder$cp()Lv7/b;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e(JJ)Z
    .locals 2

    .line 1
    const v0, 0x5f5e100

    .line 2
    .line 3
    .line 4
    int-to-long v0, v0

    .line 5
    add-long/2addr p3, v0

    .line 6
    cmp-long p1, p3, p1

    .line 7
    .line 8
    if-gez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method


# virtual methods
.method public final d(Lv7/b;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/modules/network/NetworkingModule;->access$setCustomClientBuilder$cp(Lv7/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
