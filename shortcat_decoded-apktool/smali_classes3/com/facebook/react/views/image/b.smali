.class public final Lcom/facebook/react/views/image/b;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/b$a;
    }
.end annotation


# static fields
.field public static final h:Lcom/facebook/react/views/image/b$a;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/image/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/image/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIII)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 4
    iput p3, p0, Lcom/facebook/react/views/image/b;->a:I

    .line 5
    iput-object p4, p0, Lcom/facebook/react/views/image/b;->b:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lcom/facebook/react/views/image/b;->c:Ljava/lang/String;

    .line 7
    iput p6, p0, Lcom/facebook/react/views/image/b;->d:I

    .line 8
    iput p7, p0, Lcom/facebook/react/views/image/b;->e:I

    .line 9
    iput p8, p0, Lcom/facebook/react/views/image/b;->f:I

    .line 10
    iput p9, p0, Lcom/facebook/react/views/image/b;->g:I

    return-void
.end method

.method synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x8

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p4, v0

    :cond_0
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_1

    move-object p5, v0

    :cond_1
    and-int/lit8 p11, p10, 0x20

    const/4 v0, 0x0

    if-eqz p11, :cond_2

    move p6, v0

    :cond_2
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_3

    move p7, v0

    :cond_3
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_4

    move p8, v0

    :cond_4
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_5

    move p10, v0

    :goto_0
    move p9, p8

    move p8, p7

    move p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_5
    move p10, p9

    goto :goto_0

    .line 2
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/facebook/react/views/image/b;-><init>(IIILjava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Lcom/facebook/react/views/image/b;-><init>(IIILjava/lang/String;Ljava/lang/String;IIII)V

    return-void
.end method

.method private final b()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "uri"

    .line 6
    .line 7
    iget-object v2, p0, Lcom/facebook/react/views/image/b;->c:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/facebook/react/views/image/b;->d:I

    .line 13
    .line 14
    int-to-double v1, v1

    .line 15
    const-string v3, "width"

    .line 16
    .line 17
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 18
    .line 19
    .line 20
    iget v1, p0, Lcom/facebook/react/views/image/b;->e:I

    .line 21
    .line 22
    int-to-double v1, v1

    .line 23
    const-string v3, "height"

    .line 24
    .line 25
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/image/b;->a:I

    .line 2
    .line 3
    int-to-short v0, v0

    .line 4
    return v0
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
    iget v1, p0, Lcom/facebook/react/views/image/b;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_2

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v1, v2, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x5

    .line 14
    if-eq v1, v2, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string v1, "loaded"

    .line 18
    .line 19
    iget v2, p0, Lcom/facebook/react/views/image/b;->f:I

    .line 20
    .line 21
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const-string v1, "total"

    .line 25
    .line 26
    iget v2, p0, Lcom/facebook/react/views/image/b;->g:I

    .line 27
    .line 28
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lcom/facebook/react/views/image/b;->f:I

    .line 32
    .line 33
    int-to-double v1, v1

    .line 34
    iget v3, p0, Lcom/facebook/react/views/image/b;->g:I

    .line 35
    .line 36
    int-to-double v3, v3

    .line 37
    div-double/2addr v1, v3

    .line 38
    const-string v3, "progress"

    .line 39
    .line 40
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    const-string v1, "source"

    .line 45
    .line 46
    invoke-direct {p0}, Lcom/facebook/react/views/image/b;->b()Lcom/facebook/react/bridge/WritableMap;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    const-string v1, "error"

    .line 55
    .line 56
    iget-object v2, p0, Lcom/facebook/react/views/image/b;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/b;->h:Lcom/facebook/react/views/image/b$a;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/views/image/b;->a:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/image/b$a;->f(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
