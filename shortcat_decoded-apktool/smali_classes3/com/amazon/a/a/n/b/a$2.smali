.class Lcom/amazon/a/a/n/b/a$2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/a/a/n/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/a/n/b/a;->c(Lcom/amazon/a/a/n/a;)Lcom/amazon/a/a/n/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/a/n/a;

.field final synthetic b:Lcom/amazon/a/a/n/b/a;


# direct methods
.method constructor <init>(Lcom/amazon/a/a/n/b/a;Lcom/amazon/a/a/n/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/a/n/b/a$2;->b:Lcom/amazon/a/a/n/b/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/amazon/a/a/n/b/a$2;->a:Lcom/amazon/a/a/n/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/amazon/a/a/n/b/a$2;->b:Lcom/amazon/a/a/n/b/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/amazon/a/a/n/b/a$2;->a:Lcom/amazon/a/a/n/a;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v0, v1, v2}, Lcom/amazon/a/a/n/b/a;->a(Lcom/amazon/a/a/n/b/a;Lcom/amazon/a/a/n/a;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Future:PostToUITask: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/amazon/a/a/n/b/a$2;->a:Lcom/amazon/a/a/n/a;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method
