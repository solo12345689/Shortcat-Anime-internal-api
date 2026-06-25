.class Lcom/amazon/a/g$3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/a/a/c/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/g;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/amazon/a/a/c/c<",
        "Lcom/amazon/a/a/a/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/g;


# direct methods
.method constructor <init>(Lcom/amazon/a/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/g$3;->a:Lcom/amazon/a/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Lcom/amazon/a/a/c/b;
    .locals 1

    .line 2
    sget-object v0, Lcom/amazon/a/a/a/a/d;->a:Lcom/amazon/a/a/a/a/d;

    return-object v0
.end method

.method public a(Lcom/amazon/a/a/a/a/c;)V
    .locals 0

    .line 3
    iget-object p1, p0, Lcom/amazon/a/g$3;->a:Lcom/amazon/a/g;

    invoke-static {p1}, Lcom/amazon/a/g;->a(Lcom/amazon/a/g;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/amazon/a/a/c/a;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/amazon/a/a/a/a/c;

    invoke-virtual {p0, p1}, Lcom/amazon/a/g$3;->a(Lcom/amazon/a/a/a/a/c;)V

    return-void
.end method

.method public b()Lcom/amazon/a/a/c/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/amazon/a/a/c/d;->c:Lcom/amazon/a/a/c/d;

    .line 2
    .line 3
    return-object v0
.end method
