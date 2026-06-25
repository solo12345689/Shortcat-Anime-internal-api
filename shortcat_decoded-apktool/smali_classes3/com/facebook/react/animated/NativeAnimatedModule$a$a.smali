.class public final Lcom/facebook/react/animated/NativeAnimatedModule$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule$a;
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
    invoke-direct {p0}, Lcom/facebook/react/animated/NativeAnimatedModule$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/facebook/react/animated/NativeAnimatedModule$a;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$a;->b()[Lcom/facebook/react/animated/NativeAnimatedModule$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$a;->values()[Lcom/facebook/react/animated/NativeAnimatedModule$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/facebook/react/animated/NativeAnimatedModule$a;->b()[Lcom/facebook/react/animated/NativeAnimatedModule$a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/animated/NativeAnimatedModule$a;->c([Lcom/facebook/react/animated/NativeAnimatedModule$a;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    add-int/lit8 p1, p1, -0x1

    .line 21
    .line 22
    aget-object p1, v0, p1

    .line 23
    .line 24
    return-object p1
.end method
