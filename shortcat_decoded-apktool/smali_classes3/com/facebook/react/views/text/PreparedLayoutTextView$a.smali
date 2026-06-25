.class final Lcom/facebook/react/views/text/PreparedLayoutTextView$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/PreparedLayoutTextView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/views/text/PreparedLayoutTextView$a;

.field private static b:Ljava/util/List;

.field private static c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->a:Lcom/facebook/react/views/text/PreparedLayoutTextView$a;

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
.method public final a(Landroid/text/Layout;Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 8

    .line 1
    const-string v0, "layout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "canvas"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->b:Ljava/util/List;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->b:Ljava/util/List;

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->c:Ljava/util/List;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->c:Ljava/util/List;

    .line 34
    .line 35
    :cond_1
    sget-object v3, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->b:Ljava/util/List;

    .line 36
    .line 37
    sget-object v4, Lcom/facebook/react/views/text/PreparedLayoutTextView$a;->c:Ljava/util/List;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    move-object v1, p1

    .line 41
    move-object v2, p2

    .line 42
    move-object v5, p3

    .line 43
    move-object v6, p4

    .line 44
    invoke-static/range {v1 .. v7}, Lcom/facebook/react/views/text/c;->a(Landroid/text/Layout;Landroid/graphics/Canvas;Ljava/util/List;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
