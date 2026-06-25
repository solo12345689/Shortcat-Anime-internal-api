.class Lxa/W$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/W$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxa/W;->a(Lxa/e;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lxa/e;


# direct methods
.method constructor <init>(Lxa/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa/W$a;->a:Lxa/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)B
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/W$a;->a:Lxa/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lxa/e;->c(I)B

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lxa/W$a;->a:Lxa/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lxa/e;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
