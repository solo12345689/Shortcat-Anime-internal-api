.class public final Lcom/facebook/react/views/text/PreparedLayout;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0010\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000c\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0016\u001a\u0004\u0008\u0012\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/facebook/react/views/text/PreparedLayout;",
        "",
        "Landroid/text/Layout;",
        "layout",
        "",
        "maximumNumberOfLines",
        "",
        "verticalOffset",
        "",
        "reactTags",
        "<init>",
        "(Landroid/text/Layout;IF[I)V",
        "a",
        "Landroid/text/Layout;",
        "()Landroid/text/Layout;",
        "b",
        "I",
        "()I",
        "c",
        "F",
        "d",
        "()F",
        "[I",
        "()[I",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/text/Layout;

.field private final b:I

.field private final c:F

.field private final d:[I


# direct methods
.method public constructor <init>(Landroid/text/Layout;IF[I)V
    .locals 1

    .line 1
    const-string v0, "layout"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "reactTags"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/views/text/PreparedLayout;->a:Landroid/text/Layout;

    .line 15
    .line 16
    iput p2, p0, Lcom/facebook/react/views/text/PreparedLayout;->b:I

    .line 17
    .line 18
    iput p3, p0, Lcom/facebook/react/views/text/PreparedLayout;->c:F

    .line 19
    .line 20
    iput-object p4, p0, Lcom/facebook/react/views/text/PreparedLayout;->d:[I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()Landroid/text/Layout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayout;->a:Landroid/text/Layout;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/PreparedLayout;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final c()[I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/text/PreparedLayout;->d:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/text/PreparedLayout;->c:F

    .line 2
    .line 3
    return v0
.end method
