.class public final Lexpo/modules/kotlin/jni/worklets/Serializable;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lexpo/modules/kotlin/jni/Destructible;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/jni/worklets/Serializable$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0008\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0017\u0010\u0005\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/worklets/Serializable;",
        "Lexpo/modules/kotlin/jni/Destructible;",
        "Lcom/facebook/jni/HybridData;",
        "mHybridData",
        "",
        "type",
        "<init>",
        "(Lcom/facebook/jni/HybridData;I)V",
        "LTd/L;",
        "finalize",
        "()V",
        "a",
        "()Lcom/facebook/jni/HybridData;",
        "Lcom/facebook/jni/HybridData;",
        "Lexpo/modules/kotlin/jni/worklets/Serializable$a;",
        "Lexpo/modules/kotlin/jni/worklets/Serializable$a;",
        "b",
        "()Lexpo/modules/kotlin/jni/worklets/Serializable$a;",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lexpo/modules/kotlin/jni/worklets/Serializable$a;

.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method private constructor <init>(Lcom/facebook/jni/HybridData;I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/kotlin/jni/worklets/Serializable;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 5
    .line 6
    invoke-static {}, Lexpo/modules/kotlin/jni/worklets/Serializable$a;->b()Lkotlin/enums/EnumEntries;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lexpo/modules/kotlin/jni/worklets/Serializable$a;

    .line 25
    .line 26
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/worklets/Serializable$a;->c()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, p2, :cond_0

    .line 31
    .line 32
    iput-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Serializable;->a:Lexpo/modules/kotlin/jni/worklets/Serializable$a;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 36
    .line 37
    const-string p2, "Collection contains no element matching the predicate."

    .line 38
    .line 39
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method


# virtual methods
.method public a()Lcom/facebook/jni/HybridData;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Serializable;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lexpo/modules/kotlin/jni/worklets/Serializable$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Serializable;->a:Lexpo/modules/kotlin/jni/worklets/Serializable$a;

    .line 2
    .line 3
    return-object v0
.end method

.method protected final finalize()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/worklets/Serializable;->mHybridData:Lcom/facebook/jni/HybridData;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/jni/HybridData;->resetNative()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
