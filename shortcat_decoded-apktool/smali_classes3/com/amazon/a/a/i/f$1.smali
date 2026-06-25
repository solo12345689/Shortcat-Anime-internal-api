.class Lcom/amazon/a/a/i/f$1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/a/a/n/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/a/i/f;->a(Lcom/amazon/a/a/i/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/a/i/b;

.field final synthetic b:Lcom/amazon/a/a/i/f;


# direct methods
.method constructor <init>(Lcom/amazon/a/a/i/f;Lcom/amazon/a/a/i/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/a/i/f$1;->b:Lcom/amazon/a/a/i/f;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/amazon/a/a/i/f$1;->a:Lcom/amazon/a/a/i/b;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/amazon/a/a/i/f$1;->b:Lcom/amazon/a/a/i/f;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/amazon/a/a/i/f$1;->a:Lcom/amazon/a/a/i/b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/amazon/a/a/i/f;->a(Lcom/amazon/a/a/i/f;Lcom/amazon/a/a/i/b;)V

    .line 6
    .line 7
    .line 8
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
    const-string v1, "Prompt Presentation on Main Thread: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/amazon/a/a/i/f$1;->a:Lcom/amazon/a/a/i/b;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/amazon/a/a/i/f$1;->a:Lcom/amazon/a/a/i/b;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/amazon/a/a/e/c;->a()Ljava/util/Date;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
