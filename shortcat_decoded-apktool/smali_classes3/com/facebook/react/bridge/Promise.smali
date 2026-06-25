.class public interface abstract Lcom/facebook/react/bridge/Promise;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\u0008\t\u0010\rJ+\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH&\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000bH&\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\t\u0010\u0012J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\t\u0010\u0013J)\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\t\u0010\u0014J)\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\t\u0010\u0015J7\u0010\t\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&\u00a2\u0006\u0004\u0008\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0006H\'\u00a2\u0006\u0004\u0008\t\u0010\u0017\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0018\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/bridge/Promise;",
        "",
        "value",
        "LTd/L;",
        "resolve",
        "(Ljava/lang/Object;)V",
        "",
        "code",
        "message",
        "reject",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "throwable",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "(Ljava/lang/Throwable;)V",
        "Lcom/facebook/react/bridge/WritableMap;",
        "userInfo",
        "(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V",
        "(Ljava/lang/String;)V",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract reject(Ljava/lang/String;)V
    .annotation runtime LTd/e;
    .end annotation
.end method

.method public abstract reject(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract reject(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract reject(Ljava/lang/Throwable;)V
.end method

.method public abstract reject(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract resolve(Ljava/lang/Object;)V
.end method
