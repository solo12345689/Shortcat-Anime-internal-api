.class final Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/revenuecat/purchases/identity/IdentityManager;->logIn(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/u;",
        "Lie/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LTd/L;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $newAppUserID:Ljava/lang/String;

.field final synthetic $oldAppUserID:Ljava/lang/String;

.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/revenuecat/purchases/identity/IdentityManager;


# direct methods
.method constructor <init>(Lcom/revenuecat/purchases/identity/IdentityManager;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/identity/IdentityManager;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function2;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->this$0:Lcom/revenuecat/purchases/identity/IdentityManager;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$oldAppUserID:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$newAppUserID:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$onError:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$onSuccess:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->this$0:Lcom/revenuecat/purchases/identity/IdentityManager;

    invoke-static {v0}, Lcom/revenuecat/purchases/identity/IdentityManager;->access$getBackend$p(Lcom/revenuecat/purchases/identity/IdentityManager;)Lcom/revenuecat/purchases/common/Backend;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$oldAppUserID:Ljava/lang/String;

    .line 4
    iget-object v2, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$newAppUserID:Ljava/lang/String;

    .line 5
    new-instance v3, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4$1;

    iget-object v4, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->this$0:Lcom/revenuecat/purchases/identity/IdentityManager;

    iget-object v5, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$onSuccess:Lkotlin/jvm/functions/Function2;

    invoke-direct {v3, v4, v5, v1, v2}, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4$1;-><init>(Lcom/revenuecat/purchases/identity/IdentityManager;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v4, p0, Lcom/revenuecat/purchases/identity/IdentityManager$logIn$4;->$onError:Lkotlin/jvm/functions/Function1;

    .line 7
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/revenuecat/purchases/common/Backend;->logIn(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
