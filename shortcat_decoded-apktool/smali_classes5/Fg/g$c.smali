.class LFg/g$c;
.super Ljava/lang/Object;

# interfaces
.implements LFg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:Ljava/lang/ThreadLocal;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, LFg/g$c;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method synthetic constructor <init>(LFg/g$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LFg/g$c;-><init>()V

    return-void
.end method
