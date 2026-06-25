.class public final Lu7/b;
.super LK6/b;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu7/b$a;
    }
.end annotation


# static fields
.field public static final D:Lu7/b$a;


# instance fields
.field private final B:Lcom/facebook/react/bridge/ReadableMap;

.field private final C:Lu7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu7/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu7/b;->D:Lu7/b$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LK6/c;Lcom/facebook/react/bridge/ReadableMap;Lu7/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LK6/b;-><init>(LK6/c;)V

    .line 3
    iput-object p2, p0, Lu7/b;->B:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    iput-object p3, p0, Lu7/b;->C:Lu7/a;

    return-void
.end method

.method public synthetic constructor <init>(LK6/c;Lcom/facebook/react/bridge/ReadableMap;Lu7/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lu7/b;-><init>(LK6/c;Lcom/facebook/react/bridge/ReadableMap;Lu7/a;)V

    return-void
.end method


# virtual methods
.method public final A()Lu7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/b;->C:Lu7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lu7/b;->B:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-object v0
.end method
