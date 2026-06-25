.class public final Lexpo/modules/updates/UpdatesPackage$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lsb/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/updates/UpdatesPackage;->e(Landroid/content/Context;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lexpo/modules/updates/UpdatesPackage;

.field final synthetic b:Landroid/content/Context;


# direct methods
.method constructor <init>(Lexpo/modules/updates/UpdatesPackage;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/updates/UpdatesPackage$b;->a:Lexpo/modules/updates/UpdatesPackage;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/updates/UpdatesPackage$b;->b:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroid/app/Application;)V
    .locals 3

    .line 1
    const-string v0, "application"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lsb/b;->a(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lexpo/modules/updates/UpdatesPackage$b;->a:Lexpo/modules/updates/UpdatesPackage;

    .line 10
    .line 11
    invoke-static {p1}, Lexpo/modules/updates/UpdatesPackage;->g(Lexpo/modules/updates/UpdatesPackage;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lexpo/modules/updates/UpdatesPackage$b;->b:Landroid/content/Context;

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p1, v2, v0, v1}, Lexpo/modules/updates/f;->c(Landroid/content/Context;ZILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lexpo/modules/updates/f;->a()Lexpo/modules/updates/c;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Lexpo/modules/updates/c;->b()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
