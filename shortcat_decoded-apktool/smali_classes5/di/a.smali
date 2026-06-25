.class public abstract Ldi/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final c:Ldi/a;


# instance fields
.field public final a:Lci/g;

.field public final b:Lci/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ldi/b;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ldi/b;->b()Ldi/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    sput-object v0, Ldi/a;->c:Ldi/a;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lci/g;Lci/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldi/a;->a:Lci/g;

    .line 5
    .line 6
    iput-object p2, p0, Ldi/a;->b:Lci/h;

    .line 7
    .line 8
    return-void
.end method

.method public static a()Z
    .locals 1

    .line 1
    sget-object v0, Ldi/a;->c:Ldi/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public static b()Ldi/a;
    .locals 1

    .line 1
    sget-object v0, Ldi/a;->c:Ldi/a;

    .line 2
    .line 3
    return-object v0
.end method
