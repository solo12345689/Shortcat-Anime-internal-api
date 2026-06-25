.class Lcom/amazon/a/a/l/c$2;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/amazon/a/a/n/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amazon/a/a/l/c;->a(Landroid/content/Intent;)Lcom/amazon/a/a/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/amazon/a/a/l/c$a;

.field final synthetic b:Lcom/amazon/a/a/l/c;


# direct methods
.method constructor <init>(Lcom/amazon/a/a/l/c;Lcom/amazon/a/a/l/c$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/amazon/a/a/l/c$2;->b:Lcom/amazon/a/a/l/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/amazon/a/a/l/c$2;->a:Lcom/amazon/a/a/l/c$a;

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
    iget-object v0, p0, Lcom/amazon/a/a/l/c$2;->b:Lcom/amazon/a/a/l/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/amazon/a/a/l/c;->b(Lcom/amazon/a/a/l/c;)Lcom/amazon/a/a/a/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lcom/amazon/a/a/a/a;->b()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lcom/amazon/a/a/l/c;->a()Lcom/amazon/a/a/o/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "No activity to call startActivityForResult on. startActivityForResult when an activity becomes visible"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/amazon/a/a/o/c;->a(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v1, p0, Lcom/amazon/a/a/l/c$2;->a:Lcom/amazon/a/a/l/c$a;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/amazon/a/a/l/c$a;->a(Landroid/app/Activity;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
