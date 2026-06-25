.class public final synthetic Lio/invertase/firebase/messaging/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;


# direct methods
.method public synthetic constructor <init>(Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/invertase/firebase/messaging/l;->a:Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/invertase/firebase/messaging/l;->a:Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;

    .line 2
    .line 3
    invoke-static {v0}, Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;->e(Lio/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
