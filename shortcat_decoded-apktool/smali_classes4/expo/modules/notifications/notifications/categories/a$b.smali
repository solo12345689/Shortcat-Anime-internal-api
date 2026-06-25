.class public final Lexpo/modules/notifications/notifications/categories/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/notifications/notifications/categories/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/notifications/notifications/categories/a;


# direct methods
.method public constructor <init>(Lexpo/modules/notifications/notifications/categories/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/categories/a$b;->a:Lexpo/modules/notifications/notifications/categories/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;LUb/u;)V
    .locals 3

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "promise"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lexpo/modules/notifications/service/NotificationsService;->a:Lexpo/modules/notifications/service/NotificationsService$a;

    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/a$b;->a:Lexpo/modules/notifications/notifications/categories/a;

    .line 14
    .line 15
    invoke-static {v0}, Lexpo/modules/notifications/notifications/categories/a;->A(Lexpo/modules/notifications/notifications/categories/a;)Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lexpo/modules/notifications/notifications/categories/a$b;->a:Lexpo/modules/notifications/notifications/categories/a;

    .line 20
    .line 21
    new-instance v2, Lexpo/modules/notifications/notifications/categories/a$a;

    .line 22
    .line 23
    invoke-direct {v2, p2, v1}, Lexpo/modules/notifications/notifications/categories/a$a;-><init>(LUb/u;Lexpo/modules/notifications/notifications/categories/a;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lexpo/modules/notifications/notifications/categories/a;->z(Lexpo/modules/notifications/notifications/categories/a;Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p1, v0, p2}, Lexpo/modules/notifications/service/NotificationsService$a;->k(Landroid/content/Context;Landroid/os/ResultReceiver;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, LUb/u;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/notifications/categories/a$b;->a([Ljava/lang/Object;LUb/u;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LTd/L;->a:LTd/L;

    .line 9
    .line 10
    return-object p1
.end method
