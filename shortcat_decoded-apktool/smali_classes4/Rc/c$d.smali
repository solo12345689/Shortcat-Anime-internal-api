.class public final LRc/c$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRc/c;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LRc/c;


# direct methods
.method public constructor <init>(LRc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LRc/c$d;->a:LRc/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, LUb/u;

    .line 10
    .line 11
    sget-object v0, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 12
    .line 13
    iget-object v1, p0, LRc/c$d;->a:LRc/c;

    .line 14
    .line 15
    invoke-static {v1}, LRc/c;->z(LRc/c;)Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, LRc/c$d;->a:LRc/c;

    .line 20
    .line 21
    new-instance v3, LRc/c$a;

    .line 22
    .line 23
    invoke-direct {v3, p1, v2}, LRc/c$a;-><init>(LUb/u;LRc/c;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, LRc/c;->A(Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, v1, p1}, Lexpo/modules/notifications/service/NotificationsService$a;->i(Landroid/content/Context;Landroid/os/ResultReceiver;)V

    .line 31
    .line 32
    .line 33
    sget-object p1, LTd/L;->a:LTd/L;

    .line 34
    .line 35
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LRc/c$d;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
