.class public final Ll1/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ll1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll1/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll1/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll1/a;->a:Ll1/a;

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
.method public final a(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "top"

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p1, v1, :cond_0

    .line 7
    .line 8
    const-string p1, "CCL"

    .line 9
    .line 10
    const-string v1, "horizontalAnchorIndexToAnchorName: Unknown horizontal index"

    .line 11
    .line 12
    invoke-static {p1, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    const-string p1, "bottom"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    return-object v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, -0x2

    .line 2
    const-string v1, "start"

    .line 3
    .line 4
    if-eq p1, v0, :cond_3

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    const-string p1, "CCL"

    .line 15
    .line 16
    const-string v0, "verticalAnchorIndexToAnchorName: Unknown vertical index"

    .line 17
    .line 18
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_0
    const-string p1, "right"

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    const-string p1, "left"

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    const-string p1, "end"

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_3
    return-object v1
.end method
