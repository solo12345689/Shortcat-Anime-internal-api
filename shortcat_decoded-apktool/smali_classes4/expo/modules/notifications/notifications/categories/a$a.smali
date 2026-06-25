.class final Lexpo/modules/notifications/notifications/categories/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/notifications/notifications/categories/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LUb/u;

.field final synthetic b:Lexpo/modules/notifications/notifications/categories/a;


# direct methods
.method constructor <init>(LUb/u;Lexpo/modules/notifications/notifications/categories/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/notifications/notifications/categories/a$a;->a:LUb/u;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/notifications/notifications/categories/a$a;->b:Lexpo/modules/notifications/notifications/categories/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    const-string v1, "notificationCategories"

    .line 5
    .line 6
    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p2, v0

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lexpo/modules/notifications/notifications/categories/a$a;->a:LUb/u;

    .line 17
    .line 18
    iget-object v0, p0, Lexpo/modules/notifications/notifications/categories/a$a;->b:Lexpo/modules/notifications/notifications/categories/a;

    .line 19
    .line 20
    invoke-virtual {v0, p2}, Lexpo/modules/notifications/notifications/categories/a;->F(Ljava/util/Collection;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p1, p2}, LUb/u;->g(Ljava/util/Collection;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    iget-object p1, p0, Lexpo/modules/notifications/notifications/categories/a$a;->a:LUb/u;

    .line 29
    .line 30
    const-string p2, "ERR_CATEGORIES_FETCH_FAILED"

    .line 31
    .line 32
    const-string v1, "A list of notification categories could not be fetched."

    .line 33
    .line 34
    invoke-interface {p1, p2, v1, v0}, LUb/u;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, Lexpo/modules/notifications/notifications/categories/a$a;->a(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method
