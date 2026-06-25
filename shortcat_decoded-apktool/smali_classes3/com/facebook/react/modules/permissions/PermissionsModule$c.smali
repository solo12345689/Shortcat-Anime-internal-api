.class public final Lcom/facebook/react/modules/permissions/PermissionsModule$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/facebook/react/bridge/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/permissions/PermissionsModule;->requestPermission(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/bridge/Promise;

.field final synthetic b:Lcom/facebook/react/modules/permissions/PermissionsModule;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Lcom/facebook/react/modules/permissions/PermissionsModule;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->a:Lcom/facebook/react/bridge/Promise;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->b:Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public varargs invoke([Ljava/lang/Object;)V
    .locals 4

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "null cannot be cast to non-null type kotlin.IntArray"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, [I

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x1

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    move v2, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v0

    .line 23
    :goto_0
    if-nez v2, :cond_1

    .line 24
    .line 25
    aget v0, v1, v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->a:Lcom/facebook/react/bridge/Promise;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->b:Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 32
    .line 33
    invoke-static {v0}, Lcom/facebook/react/modules/permissions/PermissionsModule;->access$getGRANTED$p(Lcom/facebook/react/modules/permissions/PermissionsModule;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    aget-object p1, p1, v3

    .line 42
    .line 43
    const-string v0, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity"

    .line 44
    .line 45
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast p1, Lq7/f;

    .line 49
    .line 50
    iget-object v0, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {p1, v0}, Lq7/f;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->a:Lcom/facebook/react/bridge/Promise;

    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->b:Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 61
    .line 62
    invoke-static {v0}, Lcom/facebook/react/modules/permissions/PermissionsModule;->access$getDENIED$p(Lcom/facebook/react/modules/permissions/PermissionsModule;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    iget-object p1, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->a:Lcom/facebook/react/bridge/Promise;

    .line 71
    .line 72
    iget-object v0, p0, Lcom/facebook/react/modules/permissions/PermissionsModule$c;->b:Lcom/facebook/react/modules/permissions/PermissionsModule;

    .line 73
    .line 74
    invoke-static {v0}, Lcom/facebook/react/modules/permissions/PermissionsModule;->access$getNEVER_ASK_AGAIN$p(Lcom/facebook/react/modules/permissions/PermissionsModule;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
