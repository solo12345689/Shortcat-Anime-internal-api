.class public final Lcom/facebook/react/uimanager/A;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/A$a;
    }
.end annotation


# static fields
.field public static final e:Lcom/facebook/react/uimanager/A$a;

.field private static final f:LK1/e;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/A$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/A$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/A;->e:Lcom/facebook/react/uimanager/A$a;

    .line 8
    .line 9
    const-string v0, "OnLayoutEvent"

    .line 10
    .line 11
    sget-object v1, LW6/a;->a:LW6/a;

    .line 12
    .line 13
    invoke-static {v0, v1}, LW6/b;->a(Ljava/lang/String;LW6/a;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LK1/e;

    .line 17
    .line 18
    const/16 v1, 0x14

    .line 19
    .line 20
    invoke-direct {v0, v1}, LK1/e;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/uimanager/A;->f:LK1/e;

    .line 24
    .line 25
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/A;-><init>()V

    return-void
.end method

.method public static final synthetic b()LK1/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/A;->f:LK1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(IIIIII)Lcom/facebook/react/uimanager/A;
    .locals 7

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/A;->e:Lcom/facebook/react/uimanager/A$a;

    .line 2
    .line 3
    move v1, p0

    .line 4
    move v2, p1

    .line 5
    move v3, p2

    .line 6
    move v4, p3

    .line 7
    move v5, p4

    .line 8
    move v6, p5

    .line 9
    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/uimanager/A$a;->a(IIIIII)Lcom/facebook/react/uimanager/A;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method protected final c(IIIIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/facebook/react/uimanager/A;->a:I

    .line 5
    .line 6
    iput p4, p0, Lcom/facebook/react/uimanager/A;->b:I

    .line 7
    .line 8
    iput p5, p0, Lcom/facebook/react/uimanager/A;->c:I

    .line 9
    .line 10
    iput p6, p0, Lcom/facebook/react/uimanager/A;->d:I

    .line 11
    .line 12
    return-void
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/facebook/react/uimanager/A;->a:I

    .line 11
    .line 12
    int-to-float v2, v2

    .line 13
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    float-to-double v2, v2

    .line 18
    const-string v4, "x"

    .line 19
    .line 20
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/facebook/react/uimanager/A;->b:I

    .line 24
    .line 25
    int-to-float v2, v2

    .line 26
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    float-to-double v2, v2

    .line 31
    const-string v4, "y"

    .line 32
    .line 33
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 34
    .line 35
    .line 36
    iget v2, p0, Lcom/facebook/react/uimanager/A;->c:I

    .line 37
    .line 38
    int-to-float v2, v2

    .line 39
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    float-to-double v2, v2

    .line 44
    const-string v4, "width"

    .line 45
    .line 46
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 47
    .line 48
    .line 49
    iget v2, p0, Lcom/facebook/react/uimanager/A;->d:I

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    invoke-static {v2}, Lcom/facebook/react/uimanager/B;->g(F)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    float-to-double v2, v2

    .line 57
    const-string v4, "height"

    .line 58
    .line 59
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "layout"

    .line 67
    .line 68
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "target"

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-interface {v1, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topLayout"

    .line 2
    .line 3
    return-object v0
.end method

.method public onDispose()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/A;->f:LK1/e;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LK1/e;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
