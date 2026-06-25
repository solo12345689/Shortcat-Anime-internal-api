.class public final synthetic LG8/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LG8/h;


# instance fields
.field public final synthetic a:Landroid/accounts/Account;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG8/f;->a:Landroid/accounts/Account;

    .line 5
    .line 6
    iput-object p2, p0, LG8/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LG8/f;->c:Landroid/os/Bundle;

    .line 9
    .line 10
    iput-object p4, p0, LG8/f;->d:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LG8/f;->a:Landroid/accounts/Account;

    .line 2
    .line 3
    iget-object v1, p0, LG8/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LG8/f;->c:Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v3, p0, LG8/f;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, LG8/i;->e(Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;Landroid/content/Context;Landroid/os/IBinder;)Lcom/google/android/gms/auth/TokenData;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
