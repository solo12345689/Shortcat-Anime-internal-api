.class public Lexpo/modules/kotlin/sharedobjects/SharedRef;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RefType:",
        "Ljava/lang/Object;",
        ">",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0017\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00028\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lexpo/modules/kotlin/sharedobjects/SharedRef;",
        "RefType",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "ref",
        "Llc/b;",
        "runtime",
        "<init>",
        "(Ljava/lang/Object;Llc/b;)V",
        "c",
        "Ljava/lang/Object;",
        "O",
        "()Ljava/lang/Object;",
        "",
        "d",
        "Ljava/lang/String;",
        "J",
        "()Ljava/lang/String;",
        "nativeRefType",
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
.field private final c:Ljava/lang/Object;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Llc/b;)V
    .locals 0

    .line 2
    invoke-direct {p0, p2}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Llc/b;)V

    .line 3
    iput-object p1, p0, Lexpo/modules/kotlin/sharedobjects/SharedRef;->c:Ljava/lang/Object;

    .line 4
    const-string p1, "unknown"

    iput-object p1, p0, Lexpo/modules/kotlin/sharedobjects/SharedRef;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Llc/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lexpo/modules/kotlin/sharedobjects/SharedRef;-><init>(Ljava/lang/Object;Llc/b;)V

    return-void
.end method


# virtual methods
.method public J()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/sharedobjects/SharedRef;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/sharedobjects/SharedRef;->c:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
