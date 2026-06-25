.class Lcom/facebook/react/uimanager/B0$g;
.super Lcom/facebook/react/uimanager/B0$m;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/B0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# instance fields
.field private final i:I


# direct methods
.method public constructor <init>(LB7/a;Ljava/lang/reflect/Method;I)V
    .locals 2

    .line 1
    const-string v0, "mixed"

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/facebook/react/uimanager/B0$m;-><init>(LB7/a;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/facebook/react/uimanager/C0;)V

    .line 2
    iput p3, p0, Lcom/facebook/react/uimanager/B0$g;->i:I

    return-void
.end method

.method public constructor <init>(LB7/b;Ljava/lang/reflect/Method;II)V
    .locals 6

    .line 3
    const-string v2, "mixed"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/uimanager/B0$m;-><init>(LB7/b;Ljava/lang/String;Ljava/lang/reflect/Method;ILcom/facebook/react/uimanager/C0;)V

    .line 4
    iput p4, v0, Lcom/facebook/react/uimanager/B0$g;->i:I

    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget p1, p0, Lcom/facebook/react/uimanager/B0$g;->i:I

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-static {p1, p2}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
