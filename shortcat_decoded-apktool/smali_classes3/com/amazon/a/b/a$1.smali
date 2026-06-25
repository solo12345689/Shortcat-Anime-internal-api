.class Lcom/amazon/a/b/a$1;
.super Lcom/amazon/a/a/m/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/b/a;->a(Lcom/amazon/a/b/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/amazon/a/b/a;


# direct methods
.method constructor <init>(Lcom/amazon/a/b/a;Ljava/lang/Object;Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/b/a$1;->b:Lcom/amazon/a/b/a;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, Lcom/amazon/a/a/m/a;-><init>(Ljava/lang/Object;Ljava/util/Date;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    .line 1
    new-instance v0, Lcom/amazon/a/b/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/amazon/a/b/a;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/amazon/a/a/e/a;->a:Lcom/amazon/a/a/n/b;

    .line 7
    .line 8
    sget-object v2, Lcom/amazon/a/a/n/b/d;->b:Lcom/amazon/a/a/n/b/d;

    .line 9
    .line 10
    invoke-interface {v1, v2, v0}, Lcom/amazon/a/a/n/b;->a(Lcom/amazon/a/a/n/b/d;Lcom/amazon/a/a/n/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
