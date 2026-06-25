.class public final Ldg/z$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ldg/t;

.field private final b:Ltg/j;


# direct methods
.method public constructor <init>(Ldg/t;Ltg/j;)V
    .locals 1

    .line 1
    const-string v0, "headers"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "body"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldg/z$b;->a:Ldg/t;

    .line 15
    .line 16
    iput-object p2, p0, Ldg/z$b;->b:Ltg/j;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/z$b;->b:Ltg/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ldg/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/z$b;->a:Ldg/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/z$b;->b:Ltg/j;

    .line 2
    .line 3
    invoke-interface {v0}, Ltg/Z;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
